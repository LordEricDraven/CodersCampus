var usernameTextbox = document.querySelector('#username') // select by ID
var eyeIcons = document.querySelectorAll('.fa-eye')	// select by class


eyeIcons.forEach((eyeIcon) => {
	eyeIcon.addEventListener('click', () => {
		if (eyeIcon.classList.contains('fa-eye')){
			eyeIcon.classList.replace('fa-eye', 'fa-eye-slash')
			if (eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'text'
			} else {
				document.querySelector("#confirmPassword").type = 'text'
			}
		} else{
			eyeIcon.classList.replace('fa-eye-slash', 'fa-eye')
			if (eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'password'
			} else {
				document.querySelector("#confirmPassword").type = 'password'
			}
		}
	})
	console.log
})

// This is for demonstration purposes
function myPromise (){
	return new Promise( (resolve, reject) => {
		let i = 2
	
		if (i === 1){
			resolve("Hey, i === 1, so we're cool!")
		} else {
			reject("Absolute fail. i is not 1, boooo")
		}
	})
}
// Git update test
//For demonstration purposes only
//myPromise().then((message) => {
//	console.log(message)
//}).catch((message) => {
//	console.log(message)
//})

usernameTextbox.addEventListener('blur', () => {
	var user = {
		'username': usernameTextbox.value,
	}
	checkIfUserExists(user)
	console.log("here we are after the fetch has completed")
})

async function checkIfUserExists(user){
	let responseEntity = await fetch('/users/exists', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	let userExists = await responseEntity.json()
	
	if (userExists === true){
		// this users already exists!
		console.log("Oops, this username already exists")
		usernameTextbox.focus()
		usernameTextbox.select()
		showErrorAnimation().then((message) => {
			//animation is completed at this point
			console.log("we're now in the callback function")
			console.log(message)
			usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
		})
	} 
}

function showErrorAnimation(){
	return new Promise((resolve, reject) => {
			console.log("we're in the showErrorAnimation function")
			var i = 0
			
			var animationInterval = setInterval(() => {
				i++
				usernameTextbox.style.backgroundColor = `rgb(255, ${255-i}, ${255-i})`
				if (i >= 255){
					clearInterval(animationInterval);
					resolve("Done Executing animation code")
				}	
			}, 1)
		})
}