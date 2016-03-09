Ext.define('BudgetMS.controller.contCtrl', {
	extend : 'BudgetMS.controller.baseController',
	stores : [ 'contStore','contPaymentStore' ],
	views : [ 'cont.list', 'cont.editContWin', 'cont.addContWin', 'cont.contTbarForm',
	          'cont.cp.list', 'cont.cp.editContPaymentWin', 'cont.cp.addContPaymentWin', 'cont.cp.contPaymentTbarForm'],
	models : [ 'cont','contPayment' ],
	init : function() {
		this.control({
			//.....
		});
	},
	
});
