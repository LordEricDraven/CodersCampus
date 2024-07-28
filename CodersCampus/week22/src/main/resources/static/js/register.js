var usernameTextbox = document.querySelector('#username')

usernameTextbox.addEventListener('blur', () => {
	var user = {
		'username': usernameTextbox.value,
	}
	fetch('/users/exists', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	.then((responseEntity) => responseEntity.json())
	.then( (data) => {
		if (data === true){
			// this users already exists!
			console.log("Oops, this username already exists")
			usernameTextbox.focus()
			usernameTextbox.select()
			showErrorAnimation(() => {
				//animation is completed at this point
				console.log("we're now in the callback function")
				usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
			})
		} 
	})
})

function showErrorAnimation(callback){
	console.log("we're in the showErrorAnimation function")
	var i = 0
	
	var animationInterval = setInterval(() => {
		i++
		usernameTextbox.style.backgroundColor = `rgb(255, ${255-i}, ${255-i})`
		if (i === 255){
			clearInterval(animationInterval);
			console.log("Done Executing animation code")
			callback()
		}	
	}, 1)
}