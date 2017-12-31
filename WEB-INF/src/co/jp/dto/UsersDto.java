package co.jp.dto;

/**
 * ユーザ情報DTO
 *
 */
public abstract class UsersDto {

	public Integer userId; // ユーザID
	public String userGroupName; // ユーザグループ名
	public String userName; // ユーザ名
	public Integer userPer; // ユーザ権限
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public UsersDto() {

	}

}
