package ru.mobiledimension.study.day2.homework


/**
 * DESCRIPTION
 *
 * @author U.Goryntsev on 04.06.2019
 */

fun main() {
    println(constructComplementarySequence("ACGGTAACGT"))
}

fun constructComplementarySequence(chain: String): String {
    var complementarySequence= ""
    for (i in 0 until chain.length) {
        complementarySequence += getComplementaryNucleotide(chain[i])
    }
    return complementarySequence
}

fun getComplementaryNucleotide(nucleotide: Char): Char {
    when(nucleotide) {
        'A' -> return 'T'
        'T' -> return 'A'
        'G' -> return 'C'
        'C' -> return 'G'
        else -> throw IllegalArgumentException("Invalid nucleotide: $nucleotide")
    }
}
