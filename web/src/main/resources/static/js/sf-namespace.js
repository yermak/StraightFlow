$(document).ready(function() {
$('#table_namespace').dataTable( {
    "ajax": {
        "url":"/rest/namespace",
        "dataSrc": "",
        "type": "GET"
    },
    "columns": [
        { "data": "code" },
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
        { "visible": false,  "targets": [ 3 ] }

    ]
} );
} );

function editDialog(id){
    $("#editNamespaceForm").dform()
    $("#editNamespaceForm").dform('/rest/namespace/edit/'+id);
}