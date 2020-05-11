import android.content.Context
import android.widget.Toast

class AuthenticationTest {
    public fun ToastTest(context: Context, message: String) {
        Toast.makeText(context, "This is message: $message", Toast.LENGTH_SHORT).show()
    }
}