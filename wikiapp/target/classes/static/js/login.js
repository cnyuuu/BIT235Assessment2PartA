// Name: Yu Leiye | Student ID: S1580814

document.addEventListener("DOMContentLoaded", function() {
    const passwordInput = document.getElementById("password");
    const toggleButton = document.getElementById("togglePw");

    if (passwordInput && toggleButton) {
        toggleButton.addEventListener("click", function () {
            if (passwordInput.type === "password") {
                passwordInput.type = "text";
                toggleButton.textContent = "HIDE";
            } else {
                passwordInput.type = "password";
                toggleButton.textContent = "SHOW";
            }
        });
    }
});