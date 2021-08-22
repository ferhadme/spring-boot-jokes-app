const jokeContainers = document.querySelectorAll(".jokes-container");
for (let jokeContainer of jokeContainers) {
    jokeContainer.onclick = function() {
        console.log(this.childNodes[1].textContent);
    }
}