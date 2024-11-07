package com.example.dimensionsstyles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dimensionsstyles.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Пример установки текста и стилей для TextView
        binding.titleTextView.setText(R.string.title_text)
        binding.titleTextView.setTextAppearance(this, R.style.TextTitle)

        binding.subtitleTextView.setText(R.string.subtitle_text)
        binding.subtitleTextView.setTextAppearance(this, R.style.TextSubtitle)

        binding.descriptionTextView.setText(R.string.description_text)
        binding.descriptionTextView.setTextAppearance(this, R.style.TextBody)

        // Пример настройки EditText
        binding.editText.hint = getString(R.string.edit_text_hint)
        binding.editText.setTextAppearance(this, R.style.EditTextStyle)

        // Пример настройки Button
        binding.actionButton.setText(R.string.button_text)
        binding.actionButton.setTextAppearance(this, R.style.ButtonStyle)

        // Пример установки обработчика нажатия на кнопку
        binding.actionButton.setOnClickListener {
            // Логика при нажатии на кнопку
            val inputText = binding.editText.text.toString()
            binding.descriptionTextView.text = getString(R.string.your_input, inputText)
        }
    }
}
