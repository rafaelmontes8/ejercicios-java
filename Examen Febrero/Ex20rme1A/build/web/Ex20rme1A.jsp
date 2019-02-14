<%-- 
    Document   : Ex20rme1A
    Created on : Feb 12, 2019, 10:33:38 AM
    Author     : Rafael Montes Expósito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Numeros Primos</th>
                <th></th>
            </tr>
            <tr>
                <% boolean primo=true;
                    int n1 = Integer.parseInt(request.getParameter("numero"));
                
                    for (int i = 1; i <= n1; i++) {
                    
                    for (int j = 0; j <= 5; j++) {
                        for (int h=2;h<n1;h++) {
                            if (n1 % h==0) {
                                primo=false;
                            }  
                        }
                        if (primo==true) {
                            %><td style="color:yellow"><%out.print(i);%></td><%
                        } else {
                            %><td style="color: grey"><%out.print(i);%></td><%
                        }
                    }
                %></tr><%
                }
                        %>
        </table>
        <footer>
            <p>Página creada por: Rafael Montes Expósito - IES.Campanillas</p>
        </footer>
    </body>
</html>
