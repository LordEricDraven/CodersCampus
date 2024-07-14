var submitBtn = document.querySelector("#submitBtn")
var users = []
			
submitBtn.addEventListener('click', () => {
	var username = document.querySelector("#username")
	var password = document.querySelector("#password")

	if(username.value == '' && password.value == ''){
		alert(`Please enter a valid username and a password`)
	} else {
		console.log(`Inputs look valid, proceed with form submission`)
		var user = {
			"username" : username.value,
			"password" : password.value
		}
		
		users.push(user)
	}
})