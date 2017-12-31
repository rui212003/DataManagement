package co.jp.dto;

/**
 * 操作履歴情報DTO
 *
 */
public abstract class LoglistDto {

	public Integer logsId; // 操作ID
	public String logsTable; // テーブル名
	public String logsEdit; // 操作名
	public String logsDataId; // 操作データID
	public String trkDate; // 登録日付
	public String updDate; // 更新日付

	/** コンストラクタ */
	public LoglistDto() {

	}

}
