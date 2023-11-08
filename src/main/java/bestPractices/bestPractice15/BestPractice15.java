package bestPractices.bestPractice15;

/**
 * Avoid Using BigDecimal Class
 * We know that BigDecimal class provides accurate precision for the decimal values.
 * Over usage of this object hampers the performance drastically specifically when the
 * same is used to calculate certain values in a loop. BigDecimal uses a lot of memory
 * over long or double to perform calculations. If precision is not the constraint or
 * if we are sure the range of the calculated value will not exceed long or double we
 * can avoid using BigDecimal and use long or double with proper casting instead.
 */
public class BestPractice15 {
}
