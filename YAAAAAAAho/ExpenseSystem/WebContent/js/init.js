(function($){
  $(function(){

    $('.button-collapse').sideNav();
    $('.parallax').parallax();
    $(document).ready(function() {
        $('select').material_select();
      });
    $('.datepicker').pickadate({
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 15 // Creates a dropdown of 15 years to control year
      });
    
    $('.chips').material_chip();
    $('.chips-initial').material_chip({
      data: [{
        tag: '设备费',
      }, {
        tag: '材料费',
      }, {
        tag: '差旅费',
      }],
    });
    $('.chips-placeholder').material_chip({
      placeholder: 'Enter a tag',
      secondaryPlaceholder: '+Tag',
    });
    
    
    
  }); // end of document ready
})(jQuery); // end of jQuery name space