package co.jp.dto;

/**
 * 商品情報DTO
 *
 */
public abstract class GoodsListDto {

	public Integer goodsListId; // 商品ID
	public Integer goodsBigtypeId; // 商品大分類
	public Integer goodsMiddletypeId; // 商品中分類
	public Integer goodsSmalltypeId; // 商品小分類
	public String goodsListName; // 商品名
	public String goodsBarcode; // 商品バーコード
	public Double goodsPriceJP; // 商品定価（円）
	public Double goodsPriceCH; // 商品売価（元）
	public String goodsUnitName; // 商品単位
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public GoodsListDto() {

	}

}
