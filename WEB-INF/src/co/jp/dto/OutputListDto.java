package co.jp.dto;

/**
 * 出庫情報DTO
 *
 */
public abstract class OutputListDto {

	public Integer outputListId; // 出庫ID
	public Integer goodsListId; // 商品表ID
	public Integer outputNum; // 出庫数量
	public Double outputDiscount; // 出庫割引
	public String outputDate; // 出庫日付
	public String outputTrackNum; // 出庫追跡番号
	public Integer warehouseId; // 倉庫名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public OutputListDto() {

	}

}
