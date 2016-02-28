Ext.define('BudgetMS.controller.contCtrl', {
	extend : 'BudgetMS.controller.baseController',
	stores : [ 'contStore' ],
	views : [ 'cont.list', 'cont.editContWin', 'cont.addContWin', 'cont.contTbarForm' ],
	models : [ 'cont' ],
	init : function() {
		this.control({
			//.....
		});
	},
	
});
