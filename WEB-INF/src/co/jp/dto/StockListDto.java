package co.jp.dto;

/**
 * 在庫情報DTO
 *
 */
public abstract class StockListDto {

	public Integer stockListId; // 在庫ID
	public Integer goodsListId; // 商品表ID
	public Integer stockputNum; // 在庫数量
	public String stockDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public StockListDto() {

	}

}
