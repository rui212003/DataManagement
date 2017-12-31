package co.jp.dto;

/**
 * 商品単位DTO
 *
 */
public abstract class GoodsUnitDto {

	public Integer goodsUnitId; // 商品単位ID
	public String goodsUnitName; // 商品単位名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public GoodsUnitDto() {

	}

}
