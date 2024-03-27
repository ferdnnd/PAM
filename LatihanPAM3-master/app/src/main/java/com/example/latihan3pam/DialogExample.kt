import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.example.latihan3pam.databinding.DialogExampleBinding

class DialogExample(context: Context) : Dialog(context) {

    private lateinit var binding: DialogExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DialogExampleBinding.inflate(LayoutInflater.from(context))
        setContentView(binding.root)

        binding.dialogTitle.text = "view dialog"

        binding.dialogButton.setOnClickListener {
            dismiss()
        }
    }
}
