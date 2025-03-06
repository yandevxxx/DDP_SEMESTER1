let tasks = JSON.parse(localStorage.getItem('tasks')) || [];

// Add a new task
function addTask() {
    const taskInput = document.getElementById('taskInput');
    const task = taskInput.value.trim();
    if (task) {
        tasks.push({ text: task, done: false, explanation: '' });
        taskInput.value = '';
        saveTasks();
        renderTasks();
    }
}

// Save tasks to local storage
function saveTasks() {
    localStorage.setItem('tasks', JSON.stringify(tasks));
}

// Render active and done tasks
function renderTasks() {
    const taskList = document.getElementById('taskList');
    const doneList = document.getElementById('doneList');
    taskList.innerHTML = '';
    doneList.innerHTML = '';

    tasks.forEach((task, index) => {
        const li = document.createElement('li');
        li.innerHTML = `${task.text} <button onclick="markTaskAsDone(${index})">Done</button> <button onclick="removeTask(${index})">Delete</button>`;
        if (task.done) {
            li.innerHTML += ` <button onclick="viewTaskDetails(${index})">View Details</button>`;
            doneList.appendChild(li);
        } else {
            taskList.appendChild(li);
        }
    });
}

// Mark a task as done
function markTaskAsDone(index) {
    tasks[index].done = true;
    saveTasks();
    renderTasks();
}

// View task details
function viewTaskDetails(index) {
    const task = tasks[index];
    localStorage.setItem('currentTaskIndex', index);
    localStorage.setItem('currentTaskText', task.text);
    localStorage.setItem('currentTaskExplanation', task.explanation);
    window.location.href = 'details.html';
}

// Remove a task with confirmation
function removeTask(index) {
    if (confirm("Are you sure you want to delete this task?")) {
        tasks.splice(index, 1);
        saveTasks();
        renderTasks();
    }
}

// Initial render
renderTasks();
