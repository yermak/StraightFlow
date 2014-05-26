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
                result = '<a href="#" onclick="editDialog('+row.id+')">'+data+'</a>';
                alert(result);
                return result;
            },
            "targets": 0
        },
        { "visible": false,  "targets": [ 3 ] }

    ]
} );
} );

function editDialog(id){
    alert(id);
    $("#editNamespaceForm").dform('/rest/namespace/edit/'+id);
}