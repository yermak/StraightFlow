$(document).ready(function() {
$('#table_field_configuration').dataTable( {
    "ajax": {
        "url":"/rest/field_configuration",
        "dataSrc": "",
        "type": "GET"
    },
    "columns": [
        { "data": "name" },
        { "data": "description" },
        { "data": "id" }
    ],
    "columnDefs": [
            {
                "render": function ( data, type, row ) {
                    return  '<a href="#" onclick="editDialog(\''+row.id+'\')">'+data+'</a>';
                },
                "targets": 0
            },
            {
                "render": function ( data, type, row ) {
                    return  '<a href="#" onclick="configure(\''+row.id+'\')">Configure</a>';
                },
                "targets": 2,
                "sortable": false
            },
            {
                "render": function ( data, type, row ) {
                    return  row.id;
                },
                "targets": 1
            },


        ]
} );
} );

function editDialog(id) {
    alert(1);
    alert($("#editFieldConfigurationForm"));

    $("#editFieldConfigurationForm").dform('/rest/field_configuration/edit/'+id);
}

function configure(id) {
    alert('Configured:'+id)
}