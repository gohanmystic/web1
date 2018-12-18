$(function() {
    /**
     * Set up Datatables plugins for Question table
     */
    $('#data-table').DataTable({
        dom: 
            "<'row'<'col-sm-12 col-md-6 m-b-0-i'l><'col-sm-12 col-md-6 m-b-0-i'f>>" +
            "<'row'<'col-sm-12'tr>>" +
            "<'row'<'col-sm-12 col-md-5 m-b-0-i'i><'col-sm-12 col-md-7 m-b-0-i'p>>",
        ordering: false,
        searching: true,
        lengthChange: true,
        pageLength: 10,
        bInfo : true,
        language: {
            paginate: {
                previous: "&laquo",
                next: "&raquo",
            }
        },
        drawCallback: function(settings) {
            var pagination = $(this).closest('.dataTables_wrapper').find('.dataTables_paginate');
            pagination.toggle(this.api().page.info().pages > 1);
            $('div.dataTables_filter input').focus();
        }
    });

    /**
     * Set up Datatables plugins for Question table
     */
    var $inputQuestionTable = $('#input-question-table').DataTable({
        dom: 
            "<'row'<'col-sm-12 col-md-6 m-b-0-i'l><'col-sm-12 col-md-6 m-b-0-i'f>>" +
            "<'row'<'col-sm-12'tr>>" +
            "<'row'<'col-sm-12 col-md-5 m-b-0-i'i><'col-sm-12 col-md-7 m-b-0-i'p>>",
        ordering: false,
        searching: true,
        lengthChange: true,
        pageLength: 10,
        bInfo : true,
        language: {
            paginate: {
                previous: "&laquo",
                next: "&raquo",
            }
        },
        drawCallback: function(settings) {
            var pagination = $(this).closest('.dataTables_wrapper').find('.dataTables_paginate');
            pagination.toggle(this.api().page.info().pages > 1);
            $('div.dataTables_filter input').focus();
        }
    });

    /**
     * Click btn save
     */
    $("#save-button").click(function(){
        var questionIdList = "";
        $inputQuestionTable.$('input[type="checkbox"]').map(function () {
            if ($(this).prop("checked")) {
                questionIdList += $(this).closest('tr').find('td.question-id').text() + ",";
            }
        });
        if(questionIdList){
            questionIdList = questionIdList.slice(0, -1);
            $("#questionIdList").val(questionIdList);
        }
        $("#input-question-form").submit();
    });

    /**
     * Click btn import excel
     */
    $("#import-excel-btn").click(function(){
       $(".file").click(); 
    });

    /**
     * Confirm import excel
     */
    $('.file').on('change', function() {
        // Set content modal
        $('#defaultModal .modal-body').html('Are you sure to import this file?');
        // Show modal
        $('#defaultModal').modal('show');
        // Click confirm modal
        $("#ok").click(function (){
            $('#import-excel-form').submit();
        });
    })

    /**
     * jQuery Validation Plugin
     * Validate create question form
     */
    $("#validation-form").validate({
        onfocusout: false,
        invalidHandler: function(form, validator) {
            var errors = validator.numberOfInvalids();
            if (errors) {
                validator.errorList[0].element.focus();
            }
        },
        highlight: function (input) {
            $(input).parents('.form-line').addClass('error');
        },
        unhighlight: function (input) {
            $(input).parents('.form-line').removeClass('error');
        },
        errorPlacement: function (error, element) {
            $(element).parents('.form-group').append(error);
        }
    });

    /**
     * Focus textarea when tab cancel
     */
    $("#btn-cancel").on('keydown', function(e) {
        if (e.keyCode == 9) {
            $("[autofocus='autofocus']").focus();
            e.preventDefault();
        }
    });
});