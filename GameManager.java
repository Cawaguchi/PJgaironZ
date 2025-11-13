public class GameManager {

    // 共通のグローバル変数
    public static boolean debugMode = false;

    // ===== 各メンバーが追加・修正するメソッド群 =====
    // ※チーム全員がこのファイルを編集する（衝突ポイント）

    // (Displayクラス担当) 初期メッセージやタイトル表示など
    public static void showTitle() {
    }

    // (Inputクラス担当) デバッグログ出力
    public static void log(String text) {
    }

    // (Judgeクラス担当) 手の名前を取得する関数
    public static String handName(int hand) {
    }

    // (Mainクラス担当) 勝敗メッセージ生成関数
    public static String makeResultMessage(String name, boolean win, boolean draw) {
    }

    // (Playerクラス担当) 終了処理や再戦確認など（例）

    // ==========================================================
}
