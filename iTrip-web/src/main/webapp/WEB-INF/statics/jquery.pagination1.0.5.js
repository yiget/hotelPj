/*
  * version 1.0.5
  * Author: Milan Makovec
  * License: Creative Commons BY-ND   
  * www.jquery-pagination.com      
*/

(function($) {

  $.pagMag = {  
    
    startPagination: function(perPage, reload, item, pager) {
           
      $item =  $('.' + item); 
      
      $pager =  $('#' + pager); 
      
      $pager.nameCookie = 'actualpage_' + pager;
      
      $pager.actualPage = 1; 
      
      $pager.num = $item.length; // items
      
      $pager.perPage = perPage;
      
      $pager.reload = reload;
      
      $pager.max = Math.ceil($pager.num / $pager.perPage); // pages 
      
      $item.addClass('hide');
      
      if ($pager.reload == 1) {
        if ($.cookie($pager.nameCookie)) $pager.actualPage = $.cookie($pager.nameCookie);
      }  
       
      $pager.j = 1; // default 1
            
      if ($pager.actualPage < 2) { // first opening webpage
      
        if ($pager.num > 0) { // default setting      
                
          if ($pager.num > $pager.perPage) { // pagination
                             
            $pager.i = ($pager.actualPage - 1) * $pager.perPage + 1;
                             
            for ($pager.i; $pager.i <= ($pager.actualPage * $pager.perPage); $pager.i++) {
              
              $item.eq($pager.i - 1).removeClass('hide'); 
            
            };
                                            
            if ($pager.max >= 5) {
                    
              $pager.limit = $pager.j + 4;
                    
              for ($pager.j; $pager.j <= $pager.limit; $pager.j++) {
                    
                if ($pager.j == 1) {
                      
                  $pager.append('<button class="pagerButton actual"><strong>' + $pager.j + '</strong></button> ');
                    
                } else {
                      
                  $pager.append('<button class="pagerButton">' + $pager.j + '</button> ');
                      
                }
                    
              };                                        
                  
            } else {
                  
              $pager.limit = parseInt($pager.max);
                                 
              for ($pager.j; $pager.j <= $pager.limit; $pager.j++) {
                    
                if ($pager.j == 1) {
                      
                  $pager.append('<button class="pagerButton actual"><strong>' + $pager.j + '</strong></button> ');
                    
                } else {
                      
                  $pager.append('<button class="pagerButton">' + $pager.j + '</button> ');
                      
                }
                    
              }; 
                             
            } 
                                     
          } else { // less items than perPage
                  
            $item.removeClass('hide');
                  
          };
                
          if ($pager.max >= 5) {
                  
            $pager.append('<button class="nextButton">' + '&nbsp;' + '</button> '); // next (background image)
                  
          }
                
          if ($pager.max >= 5 && $pager.actualPage <= $pager.max) $pager.append('<button class="lastButton">' + $pager.max + '</button> ');
      
          if ($pager.max > 1) $pager.append('<button class="allButton">' + '1-' + $pager.max + '</button> '); // if (actualPage <= max) 
      
        };
        
      } else if ($pager.reload == 1 && $.cookie($pager.nameCookie).substr(0, 3) == 'all') { // refreshed webpage
      
        $('.firstButton').remove();  // remove first button
              
        $('.prevButton').remove();  // remove prev button     
        
        $('.pagerButton').remove();  // remove number buttons
              
        $('.nextButton').remove();  // remove next button 
        
        $('.lastButton').remove();  // remove last button 
              
        $('.allButton').remove();  // remove all button             
              
        $item.removeClass('hide');
              
        $pager.append('<button class="pageButton">' + 'pagination' + '</button> ');  
      
      } else {  
        
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
      
      }
            
      $(document).on('click', '.firstButton', function() { // click on first button
            
        $pager.actualPage = 1;
              
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
            
      });         
            
      $(document).on('click', '.prevButton', function() { // click on prev button
            
        $pager.actualPage = parseFloat($pager.actualPage) - 1;
              
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
            
      }); 
                   
      $(document).on('click', '.pagerButton', function() { // click on number button
              
        $pager.actualPage = parseFloat($(this).text());
    
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
    
      });         
            
      $(document).on('click', '.nextButton', function() { // click on next button
            
        $pager.actualPage = parseFloat($pager.actualPage) + 1;
              
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
            
      }); 
      
      $(document).on('click', '.lastButton', function() { // click on last button    
        
        $pager.actualPage = $pager.max;
              
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
            
      });
            
      $(document).on('click', '.allButton', function() { // click on all button
            
        $('.firstButton').remove();  // remove first button
              
        $('.prevButton').remove();  // remove prev button     
        
        $('.pagerButton').remove();  // remove number buttons
              
        $('.nextButton').remove();  // remove next button 
        
        $('.lastButton').remove();  // remove last button 
              
        $('.allButton').remove();  // remove all button             
              
        $item.removeClass('hide');
              
        $pager.append('<button class="pageButton">' + 'pagination' + '</button> ');
        
        if ($pager.reload == 1) var cookieAll = 'all' + $pager.actualPage;
        
        if ($pager.reload == 1) $.cookie($pager.nameCookie, cookieAll); // set
            
      }); 
            
      $(document).on('click', '.pageButton', function() { // click on pagination button
                         
        $('.pageButton').remove();  // remove page button             
    
        if ($pager.reload == 1) $pager.actualPage = $.cookie($pager.nameCookie).substr(3);
      
        $.pagMag.pagination($pager.perPage, $pager.reload, $pager.actualPage, $pager.max, pager, $pager.nameCookie);
            
      });     
  
    },
            
    pagination: function (perPage, reload, actualPage, max, pager, nameCookie) {
            
      $pager =  $('#' + pager); 
      
      $pager.actualPage = actualPage;
      
      $pager.max = max;
      
      $pager.perPage = perPage;
      
      $pager.reload = reload; 
      
      $pager.nameCookie = nameCookie; 
      
      $('.firstButton').remove();  // remove first button
        
      $('.prevButton').remove();  // remove prev button  
        
      $('.pagerButton').remove();  // remove all buttons
              
      $('.nextButton').remove();  // remove next button
              
      $('.lastButton').remove();  // remove last button 
        
      $('.allButton').remove();  // remove all button          
              
      $item.addClass('hide'); // hide all items
              
      $pager.i = ($pager.actualPage - 1) * $pager.perPage + 1;
                         
      if ($pager.max > 5) { // max pages 
         
        if ($pager.actualPage > 3) $pager.append('<button class="firstButton">' + '1' + '</button> '); // 1 button
                
        if ($pager.actualPage > 1) $pager.append('<button class="prevButton">' + '&nbsp;' + '</button> '); // prev
              
      };
              
      for ($pager.i; $pager.i <= ($pager.actualPage * $pager.perPage); $pager.i++) {
        
        $item.eq($pager.i - 1).removeClass('hide'); // show actual items
      
      };
                
      if ($pager.actualPage < 4) {          
              
        $pager.j = 1;
              
      } else if ($pager.actualPage > 3 && $pager.actualPage < $pager.max - 2) {
              
        $pager.j = $pager.actualPage - 2; // actualPage in center
              
      } else if ($pager.actualPage > $pager.max - 3) {
              
        $pager.j = $pager.max - 4;          
              
      };
                     
      if ($pager.max >= 5) {
              
        $pager.limit = $pager.j + 4;
                  
        for ($pager.j; $pager.j <= $pager.limit; $pager.j++) { // create actual buttons
                  
          if ($pager.j == $pager.actualPage) {
                  
            $pager.append('<button class="pagerButton actual"><strong>' + $pager.j + '</strong></button> '); // actual page
                    
          } else {
                  
            $pager.append('<button class="pagerButton">' + $pager.j + '</button> '); // other pages
                  
          }
                  
        };
              
      } else {
              
        $pager.limit = parseInt($pager.max);
                  
        for ($pager.j = 1; $pager.j <= $pager.limit; $pager.j++) {              
                  
          if ($pager.j == $pager.actualPage) {
                    
            $pager.append('<button class="pagerButton actual"><strong>' + $pager.j + '</strong></button> ');
                  
          } else {
                    
            $pager.append('<button class="pagerButton">' + $pager.j + '</button> ');
                    
          }
                  
        };          
                
      };
      
      if ($pager.max >= 5) if ($pager.actualPage < $pager.max) $pager.append('<button class="nextButton">' + '&nbsp;' + '</button> '); // next (background image)
    
      if ($pager.max >= 5 && $pager.actualPage < $pager.max) $pager.append('<button class="lastButton">' + $pager.max + '</button> ');
              
      if ($pager.actualPage <= $pager.max && $pager.max > 1) $pager.append('<button class="allButton">' + '1-' + $pager.max +  '</button> ');
            
      if ($pager.reload == 1) $.cookie($pager.nameCookie, $pager.actualPage);  // set
      
    } 
    
  }; 

})(jQuery);