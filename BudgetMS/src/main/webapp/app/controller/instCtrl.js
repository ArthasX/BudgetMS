Ext.define('BudgetMS.controller.instCtrl', {
	extend : 'BudgetMS.controller.baseController',
	stores : [ 'instStore' ],
	views : [ 'inst.list', 'inst.editInstWin', 'inst.addInstWin', 'inst.instTbarForm' ],
	models : [ 'inst' ],
	init : function() {
		this.control({

		});
	},
	
});
