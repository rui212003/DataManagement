package co.jp.dto;

/**
 * 小分類DTO
 *
 */
public abstract class SmalltypeDto {

	public Integer smalltypeId; // 小分類ID
	public Integer bigtypeId; // 大分類ID
	public Integer middletypeId; // 中分類ID
	public String smalltypeName; // 小分類名
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public SmalltypeDto() {

	}

}
