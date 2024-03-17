// $(document).ready(function () {
//     // Add hover effect on table rows
//     $('#employee-table tbody tr').hover(function () {
//         $(this).css('background-color', '#f0f0f0');
//     }, function () {
//         $(this).css('background-color', '');
//     });

//     // Add slide animation when editing or deleting an employee
//     $('#employee-table tbody').on('click', '.edit-employee', function () {
//         // Implement edit logic here
//     });

//     $('#employee-table tbody').on('click', '.delete-employee', function () {
//         // Implement delete logic here
//     });
// });

$(document).ready(function () {
    // ...

    // Add a click event handler to the display button
    $('#display-employees').on('click', function () {
        // Toggle the visibility of the table with a fade-in/fade-out animation
        $('#employee-table').fadeToggle();

        // Toggle the button text with a fade animation
        if ($('#employee-table').is(':visible')) {
            $(this).fadeOut(200, function () {
                $(this).text('Hide Employees').fadeIn(200);
            });
        } else {
            $(this).fadeOut(200, function () {
                $(this).text('Display Employees').fadeIn(200);
            });
        }
    });

    // Show the "Add Employee" form with a fade-in animation
    $('#add-employee').on('click', function () {
        $('#add-employee-form').fadeIn(300);
    });

    // Hide the "Add Employee" form with a fade-out animation
    $('#cancel-add').on('click', function () {
        $('#add-employee-form').fadeOut(300);
    });

    // Show the "Edit Employee" form with a fade-in animation
    $('#employee-table tbody').on('click', '.edit-employee', function () {
        const index = $(this).data('index');
        const employee = employees[index];

        // Populate the edit form with employee details
        $('#edit-name').val(employee.name);
        $('#edit-email').val(employee.email);
        $('#edit-department').val(employee.department);

        // Show the edit form with a fade-in animation
        $('#edit-employee-form').fadeIn(300);
    });

    // Hide the "Edit Employee" form with a fade-out animation
    $('#edit-employee-form').on('click', '#cancel-edit', function () {
        $('#edit-employee-form').fadeOut(300);
    });

    // ...
    // Change the background color and text color of the "Display" button
    $('#display-employees').css({
        'background-color': 'green',
        'color': 'white'
    });

    // Change the background color and text color of the "Delete" buttons
    $('.delete-employee').css({
        'background-color': 'red',
        'color': 'white'
    });

    // Change the background color and text color of the "Add" button
    $('#add-employee').css({
        'background-color': 'black', // Change to your desired color
        'color': 'white'
    });

    // Change the background color and text color of the "Edit" buttons
    $('.edit-employee').css({
        'background-color': 'orange', // Change to your desired color
        'color': 'white'
    });

    // Change the background color and text color of the "Update" button (if applicable)
    $('#update-employee').css({
        'background-color': 'purple', // Change to your desired color
        'color': 'white'
    });
});