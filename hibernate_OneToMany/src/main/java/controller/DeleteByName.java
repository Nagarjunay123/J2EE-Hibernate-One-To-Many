package controller;

import dao.CompanyDao;

public class DeleteByName {

	public static void main(String[] args) {


		CompanyDao companyDao=new CompanyDao();
		companyDao.deleteByName("nagarjuna");
	}

}
