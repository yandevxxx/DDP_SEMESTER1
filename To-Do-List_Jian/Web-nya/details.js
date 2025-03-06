document.addEventListener('DOMContentLoaded', () => {
    loadTaskDetails();
});

// Load task details from local storage
function loadTaskDetails() {
    const index = localStorage.getItem('currentTaskIndex');
    const text = localStorage.getItem('currentTaskText');
    const explanation = localStorage.getItem('currentTaskExplanation');

    const taskDetailsDiv = document.getElementById('taskDetails');
    taskDetailsDiv.innerHTML = `
        <h2>${text}</h2>
        <p><strong>Explanation:</strong> ${explanation || 'No explanation provided.'}</p>
        <button onclick="setExplanation(${index})">Add/Edit Explanation</button>
    `;
}

// Go back to the main page
function goBack() {
    window.location.href = 'index.html';
}

// Set explanation for a task
function setExplanation(index) {
    const explanation = prompt("Enter an explanation for the task:");
    if (explanation !== null) {
        const tasks = JSON.parse(localStorage.getItem('tasks'));
        tasks[index].explanation = explanation;
        localStorage.setItem('tasks', JSON.stringify(tasks));
        alert("Explanation updated!");
        loadTaskDetails(); // Refresh the details without reloading the page
    }
}
