Ext.define('BudgetMS.controller.instCtrl', {
	extend : 'BudgetMS.controller.baseController',
	stores : [ 'instStore' ],
	views : [ 'inst.list', 'inst.edit', 'inst.add', 'inst.instTbarForm' ],
	models : [ 'inst' ],
	init : function() {
		this.control({

//			'instList' : {
//				itemdblclick : this.showUpdateInstGridDblClick
//			},
//			'instTbarForm button[name=showUpdateInst]' : {
//				click : this.showUpdateInstBtnClick
//			},
//			'instEdit button[name=updateInst]' : {
//				click : this.doUpdate
//			},
//			'instTbarForm button[name=deleteInst]' : {
//				click : this.confirmDelete
//			},
//			'instTbarForm button[name=findInst]' : {
//				click : this.doFind
//			}
		});
	},
	
});
