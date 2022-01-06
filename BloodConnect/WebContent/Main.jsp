<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <!DOCTYPE html>
<html>
                    <title>Welcome to Connect Blood</title>
                    <head>
                                        <style>
                                                            body{
                                                            background-image:
                                                            url('Images/Background.jpg');
                                                            background-size: cover;
                                                            background-repeat: no-repeat;
                                                             
                                        }
                                        div.absolute {
                                                            position: absolute;
                                                            top: 100px;
                                                            left:280px;
                                                            font-size:50px;
                                                            font-family: cursive;
                                        }
                                        #Recipient{
                                          background-color:lavenderblush;
                                          padding: 15px 32px;
                                          color:black;
                                          border:1px solid blueviolet;
                                          cursor:pointer;
                                          border-radius: 5px;
                                          text-align: center;
                                          font-size: 14px;

                                          position: absolute;
                                          top:270px;
                                          left:100px;

                                          /Replace default styling arrow/
                                          appearance:none;
                                          -webkit-appearance:none;
                                          -moz-appearance: none;
                                        }
                                        #select:focus,
                                        #select:hover{
                                              outline:none;
                                              border:1px salmon;
                                        }
                                        #select option{
                                              background:seashell;
                                        }

                                        #Donor{
                                          background-color:lavenderblush;
                                          padding: 15px 32px;
                                          color:black;
                                          border:1px solid blueviolet;
                                          cursor:pointer;
                                          border-radius: 5px;
                                          text-align: center;
                                          font-size: 14px;

                                          position: absolute;
                                          top:270px;
                                          right:650px;

                                         / Replace default styling arrow/
                                          appearance:none;
                                          -webkit-appearance:none;
                                          -moz-appearance: none;
                                        }
                                        #select:focus,
                                        #select:hover{
                                              outline:none;
                                              border:1px salmon;
                                        }
                                        #select option{
                                              background:seashell;                                             
                                        }
                                        p{
                                              font-style: italic;
                                              font-size: 30px;
                                              word-spacing: 20px;
                                              line-height: 40px;

                                        }
                                        </style>
                    </head>
                    <body>
                          <div class="absolute"><h4>You are a...</h4></div>             
                           <select name="Recipient" id="Recipient">
                                 
                                 <option value="nothing" selected disabled hidden>Recipient</option>
                                 <option value="Recipient.jsp"><a href="Recipient.jsp"></a>Recipient Registration</option>
                                 <option value="Recipientlogin.jsp"><a href="Recipientlogin.jsp"></a>Recipient Login</option>
                                 

                           </select>     
                           
                            
                        
                           <script type="text/javascript">
                                 var urlMenu = document.getElementById('Recipient');
                                 urlMenu.onchange = function(){
                                       var userOption = this.options(this.selectedIndex);
                                       if(userOption.value != "nothing"){
                                             window.open(userOption.value,"Recipient page","");
                                       }
                                 }
                           </script>
                           <select name="Donor" id="Donor">
                              <option value="nothing" selected disabled hidden>Donor</option>
                              <option value="Donor.jsp"><a href="Donor.jsp"></a>Donor Registration</option>
                              <option value="Donorlogin.jsp"><a href="Donorlogin.jsp"></a>Donor Login</option> 
                             
                        </select>
                           <script>
                                 var urlMenu = document.getElementById('Donor');
                                 urlMenu.onchange = function(){
                                       var userOption = this.options(this.selectedIndex);
                                       if(userOption.value != "nothing"){
                                             window.open(userOption.value,"Donor page","");
                                       }
                                 }
                           </script>
                           <img src = "Images/logo.png" alt = "Connect Blood" style="top:70;left:50;width:240px;height:60px">

                           <p style="position: absolute; right:70px;bottom:0px;">Remember that the <span style="color:red">Happiest people</span><br> are not those getting more,<br> but those <span style="color:red">giving more</span></p>
                    </body>
</html> 
    
    
    
 