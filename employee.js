document.getElementById('signupForm').addEventListener('submit', function(event) {
    // Check if user already exists 
    var userExists = true;

    if (userExists) {
        // Prevent form submission
        event.preventDefault();
        // Show login message
        document.getElementById('loginMessage').classList.remove('hidden');
    }
});

document.getElementById('loginForm').addEventListener('submit', function(event) {
    // Check if user exists 
    var userExists = false;

    if (!userExists) {
        // Prevent form submission
        event.preventDefault();
        // Show signup option
        document.getElementById('signupOption').classList.remove('hidden');
    }
});