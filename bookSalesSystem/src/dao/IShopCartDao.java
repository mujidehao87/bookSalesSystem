package dao;

import java.util.List;

import vo.Book;
import vo.shopCar;

public interface IShopCartDao extends IDAO<Integer,shopCar> {
	/**
	 * 
	 * @param num
	 * @return 返回购物车的数量
	 * @throws Exception
	 */
	 public List<shopCar> shopCart(int num,String number) throws Exception;
}
