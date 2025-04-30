package jp.ac.gifu_u.sadao.kogi3;

import android.os.Bundle;
import android.os.Handler; // ← 正しくHandlerをインポート
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Handlerをフィールドとして定義（finalが推奨）
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンの参照を取得
        Button b = findViewById(R.id.button);

        // ボタンクリック時の処理
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // トーストを表示
                Toast.makeText(MainActivity.this, "アプリを終了しました", Toast.LENGTH_SHORT).show();

                // 1秒後にアプリを終了
                handler.postDelayed(() -> finish(), 1000);
            }
        });
    }
}
