package co.jp.dto;

/**
 * 入庫情報DTO
 *
 */
public abstract class InputListDto {

	public Integer inputListId; // 入庫ID
	public Integer goodsListId; // 商品表ID
	public Integer inputNum; // 入庫数量
	public Double inputDiscount; // 入庫割引
	public String inputDate; // 入庫日付
	public String inputTrackNum; // 入庫追跡番号
	public Integer warehouseId; // 倉庫名
	public String inputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public InputListDto() {

	}

}
