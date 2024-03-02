package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MultiThreadingApp {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());
		
		// This starts up as many threads as there are iterations in the for loop.
		// You only want to fire up a ton of threads, if those threads are going to 
		// be waiting a lot... i.e. sending requests across the internet.
//		for (int i=0; i<50; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();
//		}
		
		// For a CPU bound operation like we have in our "SomeTask" class,
		// we should make use of an ExecutorService
		
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		List<CompletableFuture<Void>> tasks = new ArrayList<>();
		
		for (int i=0; i<20; i++) {
			CompletableFuture<Void> task = CompletableFuture.supplyAsync(() -> new SomeTask())
							 .thenApply(someTask -> someTask.call())
							 .thenAccept(dto -> System.out.println(dto));
			
			// Futures were great prior to Java 8, but now we have something
			// better
//			Future<TaskDto> futureTask = service.submit(new SomeTask());
//			System.out.println(futureTask.get());
			
			
		}
		
		message = "Done";
		System.out.println(message);
		
		while (tasks.stream()
					.filter(CompletableFuture::isDone)
					.count() < 20) {
					// this just loops and keeps the main thread alive
					// until all threads are done working
					}
				}
	}
	
	

