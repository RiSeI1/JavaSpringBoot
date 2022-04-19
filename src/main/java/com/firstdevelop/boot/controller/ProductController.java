package com.firstdevelop.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdevelop.boot.entity.Product;
import com.firstdevelop.boot.form.ProductForm;
import com.firstdevelop.boot.service.ProductService;

/**
 * プロダクトコントローラー クラス
 * 
 * @author firstdevelop.li
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	/**
	 * ジャバ プロダクトサービス.
	 */

	@Autowired
	private ProductService productService;

	/**
	 * プロダクト一覧情報.
	 * 
	 * @param model モデル
	 * @return 画面遷移先
	 */
	@RequestMapping("/searchAll")
	public String searchAll(Model model) {
		// プロダクト一覧情報を取得する
		List<Product> productList = productService.searchAll();
		// プロダクト情報をモデルに保存する
		model.addAttribute("productList", productList);
		model.addAttribute("title", "商品一覧");

		return "/product/productDetail";
	}

	/**
	 * 登録画面の初期化.
	 * 
	 * @return
	 */
	@RequestMapping("/registInit")
	public String registInit() {

		return "/product/regist";
	}

	/**
	 * プロダクトの登録.
	 * 
	 * @param form プロダクトフォーム
	 * @return 遷移先
	 */
	@RequestMapping("/regist")
	public String regist(ProductForm form) {

		// プロダクトの登録
		productService.regist(form);
		return "redirect:searchAll";
	}
}
