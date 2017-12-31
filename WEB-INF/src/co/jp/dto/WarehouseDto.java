package co.jp.dto;

/**
 * 倉庫情報DTO
 *
 */
public abstract class WarehouseDto {

	public Integer warehouseId; // 倉庫ID
	public String warehouseName; // 倉庫名
	public String userGroupName; // ユーザグループ名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public WarehouseDto() {

	}

}
