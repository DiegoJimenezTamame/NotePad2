package local.notepad.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import local.notepad.R;

public class EditNoteActivity extends AppCompatActivity {

    private EditText editTextTitle, editTextContent;
    private Button btnSaveNote, btnAttachImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        // Initialize Views
        editTextTitle = findViewById(R.id.editTextTitle);
        editTextContent = findViewById(R.id.editTextContent);
        btnSaveNote = findViewById(R.id.btnSaveNote);
        btnAttachImage = findViewById(R.id.btnAttachImage);

        // Save Note Button Click
        btnSaveNote.setOnClickListener(v -> saveNote());

        // Attach Image Button Click
        btnAttachImage.setOnClickListener(v -> openGallery());
    }

    // Save Note (Temporary Toast Message for Now)
    private void saveNote() {
        String title = editTextTitle.getText().toString().trim();
        String content = editTextContent.getText().toString().trim();

        if (title.isEmpty() && content.isEmpty()) {
            Toast.makeText(this, "Cannot save an empty note!", Toast.LENGTH_SHORT).show();
            return;
        }

        // In Step 3, we will save this to Room Database
        Toast.makeText(this, "Note Saved!", Toast.LENGTH_SHORT).show();
        finish(); // Close activity after saving
    }

    // Open Gallery to Pick an Image (Implementation in Step 4)
    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 1);
    }
}
