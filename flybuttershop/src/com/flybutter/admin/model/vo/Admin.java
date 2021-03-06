package com.flybutter.admin.model.vo;

public class Admin {

	private int userNo;
	private String userId;
	private String userName;
	private String email;
	private int lev;
	private int category;
	private String userCel;
	
	private int storeLev;
	private int storeNo;
	private String storeName;
	private String sellerNo;
	private String ceo;
	private String storeEmail;
	private int totalSales;
	private String store_Exp;
	
	
	private String f_Event_Img_Ori; 
	private String f_Event_Img_Sys; 
	private String s_Event_Img_Ori; 
	private String s_Event_Img_Sys; 
	int discount_Rate;
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	



	public Admin(String f_Event_Img_Ori, String f_Event_Img_Sys, String s_Event_Img_Ori, String s_Event_Img_Sys,
			int discount_Rate) {
		super();
		this.f_Event_Img_Ori = f_Event_Img_Ori;
		this.f_Event_Img_Sys = f_Event_Img_Sys;
		this.s_Event_Img_Ori = s_Event_Img_Ori;
		this.s_Event_Img_Sys = s_Event_Img_Sys;
		this.discount_Rate = discount_Rate;
	}







	public Admin(String sellerNo,String storeName, String store_Exp,  String ceo, String storeEmail, int storeNo, int userNo) {
		super();
		this.storeNo = storeNo;
		this.storeName = storeName;
		this.sellerNo = sellerNo;
		this.ceo = ceo;
		this.storeEmail = storeEmail;
		this.store_Exp = store_Exp;
		this.userNo = userNo;
	}
	public Admin(int lev, String userId, String userName, String email, String userCel, int userNo, int category ) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.lev = lev;
		this.category = category;
		this.userCel = userCel;
	}

	
	

	public Admin(int storeLev, String sellerNo, String storeName, String ceo, String storeEmail, int totalSales, int userNo, int storeNo) {
		super();
		this.userNo = userNo;
		this.storeLev = storeLev;
		this.storeNo = storeNo;
		this.storeName = storeName;
		this.sellerNo = sellerNo;
		this.ceo = ceo;
		this.storeEmail = storeEmail;
		this.totalSales = totalSales;
	}



	public int getUserNo() {
		return userNo;
	}



	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getStore_Exp() {
		return store_Exp;
	}



	public void setStore_Exp(String store_Exp) {
		this.store_Exp = store_Exp;
	}



	public int getLev() {
		return lev;
	}



	public void setLev(int lev) {
		this.lev = lev;
	}



	public int getCategory() {
		return category;
	}



	public void setCategory(int category) {
		this.category = category;
	}



	public String getUserCel() {
		return userCel;
	}



	public void setUserCel(String userCel) {
		this.userCel = userCel;
	}



	public int getStoreLev() {
		return storeLev;
	}



	public void setStoreLev(int storeLev) {
		this.storeLev = storeLev;
	}



	public int getStoreNo() {
		return storeNo;
	}



	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}



	public String getStoreName() {
		return storeName;
	}



	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}



	public String getSellerNo() {
		return sellerNo;
	}



	public void setSellerNo(String sellerNo) {
		this.sellerNo = sellerNo;
	}



	public String getCeo() {
		return ceo;
	}



	public void setCeo(String ceo) {
		this.ceo = ceo;
	}



	public String getStoreEmail() {
		return storeEmail;
	}



	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}



	public int getTotalSales() {
		return totalSales;
	}



	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}







	public String getF_Event_Img_Ori() {
		return f_Event_Img_Ori;
	}







	public void setF_Event_Img_Ori(String f_Event_Img_Ori) {
		this.f_Event_Img_Ori = f_Event_Img_Ori;
	}







	public String getF_Event_Img_Sys() {
		return f_Event_Img_Sys;
	}







	public void setF_Event_Img_Sys(String f_Event_Img_Sys) {
		this.f_Event_Img_Sys = f_Event_Img_Sys;
	}







	public String getS_Event_Img_Ori() {
		return s_Event_Img_Ori;
	}







	public void setS_Event_Img_Ori(String s_Event_Img_Ori) {
		this.s_Event_Img_Ori = s_Event_Img_Ori;
	}







	public String getS_Event_Img_Sys() {
		return s_Event_Img_Sys;
	}







	public void setS_Event_Img_Sys(String s_Event_Img_Sys) {
		this.s_Event_Img_Sys = s_Event_Img_Sys;
	}







	public int getDiscount_Rate() {
		return discount_Rate;
	}







	public void setDiscount_Rate(int discount_Rate) {
		this.discount_Rate = discount_Rate;
	}







	@Override
	public String toString() {
		return "Admin [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", email=" + email
				+ ", lev=" + lev + ", category=" + category + ", userCel=" + userCel + ", storeLev=" + storeLev
				+ ", storeNo=" + storeNo + ", storeName=" + storeName + ", sellerNo=" + sellerNo + ", ceo=" + ceo
				+ ", storeEmail=" + storeEmail + ", totalSales=" + totalSales + ", store_Exp=" + store_Exp
				+ ", f_Event_Img_Ori=" + f_Event_Img_Ori + ", f_Event_Img_Sys=" + f_Event_Img_Sys + ", s_Event_Img_Ori="
				+ s_Event_Img_Ori + ", s_Event_Img_Sys=" + s_Event_Img_Sys + ", discount_Rate=" + discount_Rate + "]";
	}


	



	
	
}
