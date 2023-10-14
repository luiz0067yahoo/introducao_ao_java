package com.inprolink.servercontacts.resources;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */

@Path("/contacts")
public class ContactResource {
    
    @Context
    private HttpServletRequest request;

     private List<Contact> getContactsFromSession() {
        HttpSession session = request.getSession(true);
        List<Contact> contacts = (List<Contact>) session.getAttribute("contacts");

        if (contacts == null) {
            contacts = new ArrayList<>();
            session.setAttribute("contacts", contacts);
        }

        return contacts;
    }
    
    private void setContactsFromSession( List<Contact>  contacts) {
        HttpSession session = request.getSession(true);
        session.setAttribute("contacts",contacts);
    }
    
    @GET
    @Produces("application/json")
    public List<Contact> getContacts() {
        List<Contact> contacts = getContactsFromSession();
        return contacts;
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Contact getContact(@PathParam("id") int id) {
        Contact contact=null;
        List<Contact> contacts = getContactsFromSession();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contact =contacts.get(i);
                break;
            }
        }
        return contact;        
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response  addContact(Contact contact) {
        try{
            List<Contact> contacts = getContactsFromSession();
            contact.setId((int) (Math.random() * 100));
            contacts.add(contact);
            setContactsFromSession(contacts);
            //return contact;  
            //return Response.status(Response.Status.CREATED).build();
            return  Response
                    .ok(contact)
                    .build();
        }
        catch(Exception error){
                 return Response.status(Response.Status.EXPECTATION_FAILED).build();
        }   
    }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateContact(@PathParam("id") int id, Contact updatedContact) {
        List<Contact> contacts = getContactsFromSession();
        Contact contact=null;
        updatedContact.setId(id);
        boolean found=false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contacts.set(i, updatedContact);
                contact=updatedContact;
                found=true;
                break;
            }
        }
        setContactsFromSession(contacts);
        if(found){
            return Response.status(Response.Status.OK).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        } 
    }

    @DELETE
    @Path("/{id}")
    public Response deleteContact(@PathParam("id") int id) {
        List<Contact> contacts = getContactsFromSession();
        boolean found=false;
        Contact contact=null;
        for (int i = 0; i < contacts.size(); i++) {
            contact=contacts.get(i);
            if (contact.getId() == id) {
                contacts.remove(i);
                setContactsFromSession(contacts);
                found=true;                        
                break;
            }
        }
        if(found){
            return Response.status(Response.Status.OK).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}