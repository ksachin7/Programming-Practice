$(document).ready(function () {
    // Initialize the employee data if not already present in localStorage
    if (!localStorage.getItem('employeeData')) {
        localStorage.setItem('employeeData', JSON.stringify([]));
    }

    let employees = [];

    // Function to render the employee table
    function renderEmployeeTable() {
        // Fetch employee data from localStorage
        employees = JSON.parse(localStorage.getItem('employeeData'));

        // Clear the table body
        $('#employee-table tbody').empty();

        // Loop through employees and add rows to the table
        employees.forEach(function (employee, index) {
            const row = `
                <tr>
                    <td>${index + 1}</td>
                    <td>${employee.name}</td>
                    <td>${employee.email}</td>
                    <td>${employee.department}</td>
                    <td>
                        <button class="edit-employee" data-index="${index}">Edit</button>
                        <button class="delete-employee" data-index="${index}">Delete</button>
                    </td>
                </tr>
            `;
            $('#employee-table tbody').append(row);
        });
    }

    // Initialize the employee table
    renderEmployeeTable();

    // Event delegation for editing and deleting employees
    $('#employee-table tbody').on('click', '.edit-employee', function () {
        const index = $(this).data('index');
        // Implement edit logic here using the employee data at index
        // Inside the event delegation for editing employees
        const employee = employees[index];

        // Populate the edit form with employee details
        $('#name').val(employee.name);
        $('#email').val(employee.email);
        $('#department').val(employee.department);

        // Show the edit form
        $('#add-employee-form').show();
    });

    $('#employee-table tbody').on('click', '.delete-employee', function () {
        const index = $(this).data('index');
        // Implement delete logic here and update the employeeData array
        const employees = JSON.parse(localStorage.getItem('employeeData'));
        employees.splice(index, 1);
        localStorage.setItem('employeeData', JSON.stringify(employees));
        // Refresh the table
        renderEmployeeTable();
    });

    // Show the "Add Employee" form when the button is clicked
    $('#add-employee').on('click', function () {
        $('#add-employee-form').show();
    });

    // Hide the "Add Employee" form when the "Cancel" button is clicked
    $('#cancel-add').on('click', function () {
        $('#add-employee-form').hide();
    });

    // Function to validate the "Add Employee" form
    function validateAddEmployeeForm() {
        const name = $('#name').val();
        const email = $('#email').val();
        const department = $('#department').val();

        // Define regular expressions for email validation
        const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

        // Initialize a variable to track validation status
        let isValid = true;

        // Validate name (required)
        if (name.trim() === '') {
            isValid = false;
            alert('Name is required.');
        }

        // Validate email (required and in the correct format)
        if (email.trim() === '') {
            isValid = false;
            alert('Email is required.');
        } else if (!emailRegex.test(email)) {
            isValid = false;
            alert('Invalid email address.');
        } else {
            // Check for duplicate email
            const employees = JSON.parse(localStorage.getItem('employeeData'));
            if (employees.some(employee => employee.email === email)) {
                isValid = false;
                alert('Email is already in use.');
            }
        }

        // Validate department (required)
        if (department.trim() === '') {
            isValid = false;
            alert('Department is required.');
        }

        return isValid;
    }

    // Function to add a new employee
    $('#add-employee-form').on('submit', function (event) {
        event.preventDefault();

        // Validate the form before adding an employee
        if (!validateAddEmployeeForm()) {
            return;
        }

        const name = $('#name').val();
        const email = $('#email').val();
        const department = $('#department').val();

        // Create an employee object
        const newEmployee = {
            name: name,
            email: email,
            department: department
        };

        // Add the new employee to the data
        const employees = JSON.parse(localStorage.getItem('employeeData'));
        employees.push(newEmployee);
        localStorage.setItem('employeeData', JSON.stringify(employees));

        // Refresh the table and hide the form
        renderEmployeeTable();
        $('#add-employee-form').hide();

        // Clear the form fields
        $('#name').val('');
        $('#email').val('');
        $('#department').val('');
    });


    // Add a click event handler to the display button
    $('#display-employees').on('click', function () {
        // Toggle the visibility of the table
        $('#employee-table').toggle();

        // Toggle the button text
        if ($('#employee-table').is(':visible')) {
            $(this).text('Hide Employees');
        } else {
            $(this).text('Display Employees');
        }
    });

});
