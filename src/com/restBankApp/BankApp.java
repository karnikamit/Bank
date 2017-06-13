package com.restBankApp;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bank")
public class BankApp {
	private int defaultAccNumber = 123;

	@POST
	@Path("/account")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response newAccount(Account accountDetails){
		/*
		 * API to Create new Bank Account
		 */
		Account newAcc = new Account(accountDetails);
		int accNumber = this.defaultAccNumber ++;
		newAcc.setAccId(accNumber);
		return Response.ok().entity(accNumber).build();
	}

	@POST
	@Path("/account/{id}/")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response transaction(@QueryParam("action") String action, @QueryParam("funds") double funds,
			@PathParam("id") int accId){
		/*
		 * API for BANK transactions - Deposit/Withdraw
		 */
		return Response.ok().build();
	}

	@GET
	@Path("/account/transsactions/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getAccHistory(@PathParam("id") int accId){
		/*
		 * API To get the Transaction HIstory of a Account
		 */
		// get the account
		// get the history of transaction of that account
		return Response.ok().build();
	}

	@GET
	@Path("/account/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getAccDetails(@PathParam("id") int accId){
		/*
		 * API to get the Account details
		 */
		return Response.ok().build();
	}

}
