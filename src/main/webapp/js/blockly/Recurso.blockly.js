window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Recurso = window.blockly.js.blockly.Recurso || {};

/**
 * @function getRemuneracao
 *
 *
 *
 *
 * @author Francisco Iago De Sousa Mendes
 * @since 7/28/2023, 2:50:45 PM
 *
 */
window.blockly.js.blockly.Recurso.getRemuneracaoArgs = [];
window.blockly.js.blockly.Recurso.getRemuneracao = async function() {

  //
  this.cronapi.screen.changeValueOfField("Recursos.active.remuneracao", this.cronapi.screen.getValueOfField("CargosCombo.active.remuneracao_base"));
}
