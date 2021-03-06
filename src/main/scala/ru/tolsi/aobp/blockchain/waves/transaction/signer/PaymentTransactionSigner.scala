package ru.tolsi.aobp.blockchain.waves.transaction.signer

import ru.tolsi.aobp.blockchain.waves.transaction.{PaymentTransaction, WavesSignedTransaction}
import ru.tolsi.aobp.blockchain.waves.{DataForSignCreator, Signature64, WavesBlockChain, WavesSigner}

private[signer] class PaymentTransactionSigner(implicit dataForSignCreator: DataForSignCreator[PaymentTransaction]) extends WavesSigner[PaymentTransaction, WavesSignedTransaction[PaymentTransaction], Signature64] {
  override def sign(tx: PaymentTransaction)(implicit bc: WavesBlockChain): WavesSignedTransaction[PaymentTransaction] = {
    val signature = new Signature64(dataForSignCreator.serialize(tx))
    WavesSignedTransaction(tx, signature)
  }
}
