package co.jp.dto;

/**
 * 大分類DTO
 *
 */
public abstract class BigtypeDto {

	public Integer bigtypeId; // 大分類ID
	public String bigtypeName; // 大分類名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public BigtypeDto() {

	}

}
