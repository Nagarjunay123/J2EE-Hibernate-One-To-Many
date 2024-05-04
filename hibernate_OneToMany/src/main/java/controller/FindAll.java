package controller;

import dao.CompanyDao;

public class FindAll {

	public static void main(String[] args) {


		CompanyDao companyDao=new CompanyDao();
		companyDao.findAll();
	}

}
