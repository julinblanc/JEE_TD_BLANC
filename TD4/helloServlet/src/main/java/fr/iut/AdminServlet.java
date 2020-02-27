package fr.iut;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// Seuls les utilisateurs avec le rôle adminApp peuvent faire du GET et du POST
// Le POST est nécessairement sur une connexion chiffrée
@WebServlet("/manage")
@ServletSecurity(
        httpMethodConstraints = {
                @HttpMethodConstraint(value = "GET", rolesAllowed = "adminApp"),
                @HttpMethodConstraint(value = "POST", rolesAllowed = "adminApp",
                        transportGuarantee = ServletSecurity.TransportGuarantee.CONFIDENTIAL),
        }
)
public class AdminServlet extends HttpServlet {
    // servlet code...
}
