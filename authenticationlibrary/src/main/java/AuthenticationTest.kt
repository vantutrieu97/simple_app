import android.content.Context
import android.widget.Toast

class AuthenticationTest {
    companion object {
        fun ToastTest2(context: Context, message: String) {
            Toast.makeText(context, "This is message: $message", Toast.LENGTH_SHORT).show()
        }
    }

    fun ToastTest(context: Context, message: String) {
        Toast.makeText(context, "This is message: $message", Toast.LENGTH_SHORT).show()
    }
}