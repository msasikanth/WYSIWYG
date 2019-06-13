package me.saket.markdownrenderer

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.core.content.ContextCompat
import ru.noties.markwon.core.MarkwonTheme

/**
 * Colors and dimensions to use for highlighting markdown syntax.
 */
data class MarkdownHintStyles(

    /** Used for resolving default colors and dimensions in [MarkwonTheme.builderWithDefaults]. */
    val context: Context,

    /** Color used for highlighting '**', '~~' and other syntax characters. */
    @ColorInt
    val syntaxColor: Int = color(context, R.color.markdown_syntax),

    @ColorInt
    val blockQuoteIndentationRuleColor: Int = color(context, R.color.markdown_blockquote_indentation_rule),

    @ColorInt
    val blockQuoteTextColor: Int = color(context, R.color.markdown_blockquote_text),

    /** Width of a block-quote's vertical line/stripe/rule. */
    @Px
    val blockQuoteVerticalRuleStrokeWidth: Int = dimensPx(context, R.dimen.markdown_blockquote_vertical_rule_stroke_width),

    /** Gap before a block of ordered/unordered list. */
    @Px
    val listBlockIndentationMargin: Int = dimensPx(context, R.dimen.markdown_text_block_indentation_margin),

    @ColorInt
    val linkUrlColor: Int = color(context, R.color.markdown_link_url),

    @ColorInt
    val linkTextColor: Int = color(context, R.color.markdown_link_text),

    @ColorInt
    val horizontalRuleColor: Int = color(context, R.color.markdown_horizontal_rule),

    @Px
    val horizontalRuleStrokeWidth: Int = dimensPx(context, R.dimen.markdown_horizontal_rule_stroke_width),

    @ColorInt
    val codeBackgroundColor: Int = color(context, R.color.markdown_code_background),

    /** Enables/Disables support for Underline span. This also disables use of "_" for markdown emphasis */
    val supportUnderlineSpan: Boolean = true
)

val color = { context: Context, colorResId: Int -> ContextCompat.getColor(context, colorResId) }
val dimensPx = { context: Context, dimenResId: Int -> context.resources.getDimensionPixelSize(dimenResId) }
