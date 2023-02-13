package ch06;

public interface IUserInfoDao { //인터페이스

	void insertUserInfo(UserInfo userInfo);

	void updateUserInfo(UserInfo userInfo);

	void deleteUserInfo(String userName);

	void selectUserInfo(String userName);
}
