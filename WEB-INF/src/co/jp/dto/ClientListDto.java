package co.jp.dto;

/**
 * 顧客情報DTO
 *
 */
public abstract class ClientListDto {

	public Integer clientId; // 顧客ID
	public String clientName; // 顧客名
	public String clientZip; // 顧客郵便番号
	public String clientAddress; // 顧客住所
	public String clientPhone; // 顧客電話番号
	public String clientBiko; // 備考
	public String outputDelFlg; // 削除フラグ
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public ClientListDto() {

	}

}
