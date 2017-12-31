package co.jp.dto;

/**
 * 中分類DTO
 *
 */
public abstract class MiddletypeDto {

	public Integer middletypeId; // 中分類ID
	public Integer bigtypeId; // 大分類ID
	public String middletypeName; // 中分類名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public MiddletypeDto() {

	}

}
